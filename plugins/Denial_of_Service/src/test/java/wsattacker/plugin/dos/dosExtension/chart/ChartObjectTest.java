/**
 * WS-Attacker - A Modular Web Services Penetration Testing Framework Copyright
 * (C) 2012 Andreas Falkenberg
 *
 * This program is free software; you can redistribute it and/or modify it under
 * the terms of the GNU General Public License as published by the Free Software
 * Foundation; either version 2 of the License, or (at your option) any later
 * version.
 *
 * This program is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU General Public License for more
 * details.
 *
 * You should have received a copy of the GNU General Public License along with
 * this program; if not, write to the Free Software Foundation, Inc., 51
 * Franklin Street, Fifth Floor, Boston, MA 02110-1301, USA.
 */
package wsattacker.plugin.dos.dosExtension.chart;

import org.jfree.chart.JFreeChart;
import static org.junit.Assert.*;
import org.junit.Test;
import wsattacker.plugin.dos.dosExtension.mvc.model.AttackModel;

/**
 * @author ianyo
 */
public class ChartObjectTest
{

    public ChartObjectTest()
    {
    }

    /**
     * Test of createOverlaidChart method, of class ChartObject.
     */
    @Test
    public void testCreateOverlaidChart()
    {
        AttackModel model = new AttackModel();
        ChartObject chartObject = new ChartObject( model );
        JFreeChart chart = chartObject.createOverlaidChart();

        assertNotNull( "Should contain chart object", chart );
    }
}
