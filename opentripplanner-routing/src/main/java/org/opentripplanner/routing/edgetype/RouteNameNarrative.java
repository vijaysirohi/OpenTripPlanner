/* This program is free software: you can redistribute it and/or
 modify it under the terms of the GNU Lesser General Public License
 as published by the Free Software Foundation, either version 3 of
 the License, or (at your option) any later version.

 This program is distributed in the hope that it will be useful,
 but WITHOUT ANY WARRANTY; without even the implied warranty of
 MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 GNU General Public License for more details.

 You should have received a copy of the GNU General Public License
 along with this program.  If not, see <http://www.gnu.org/licenses/>. */

package org.opentripplanner.routing.edgetype;

import org.onebusaway.gtfs.model.Trip;
import org.opentripplanner.gtfs.GtfsLibrary;
import org.opentripplanner.routing.core.EdgeNarrative;

public class RouteNameNarrative extends DelegatingEdgeNarrative {

    private Trip trip;

    public RouteNameNarrative(Trip trip, EdgeNarrative edge) {
    	super(edge);
        this.trip = trip;
    }
    @Override
    public String getName() {
        return GtfsLibrary.getRouteName(trip.getRoute());
    }

    @Override
    public Trip getTrip() {
        return trip;
    }
}