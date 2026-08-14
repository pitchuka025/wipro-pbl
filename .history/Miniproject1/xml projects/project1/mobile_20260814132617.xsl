<?xml version="1.0" encoding="UTF-8"?>

<xsl:stylesheet version="1.0"
                xmlns:xsl="http://www.w3.org/1999/XSL/Transform">

    <xsl:output method="html" indent="yes"/>

    <xsl:template match="/">

        <html>

            <head>

                <title>Mobile Showroom Sales Report</title>

                <style>

                    body {
                        font-family: Arial, sans-serif;
                        background-color: #f4f4f4;
                        padding: 20px;
                    }

                    h1 {
                        text-align: center;
                    }

                    table {
                        width: 100%;
                        border-collapse: collapse;
                        background-color: white;
                    }

                    th {
                        background-color: #2196F3;
                        color: white;
                        padding: 10px;
                    }

                    td {
                        border: 1px solid #999;
                        padding: 8px;
                        text-align: center;
                    }

                    .high {
                        color: red;
                        font-weight: bold;
                    }

                </style>

            </head>

            <body>

                <h1>Mobile Showroom Weekly Sales Report</h1>

                <table>

                    <tr>
                        <th>Model Name</th>
                        <th>Model ID</th>
                        <th>Brand</th>
                        <th>Price</th>
                        <th>Color</th>
                        <th>SIM Size</th>
                        <th>Memory</th>
                        <th>Camera</th>
                        <th>Touch Screen</th>
                        <th>No Sold</th>
                        <th>Store Name</th>
                    </tr>

                    <xsl:for-each select="MobileShowroom/Mobile">

                        <tr>

                            <td>
                                <xsl:value-of select="ModelName"/>
                            </td>

                            <td>
                                <xsl:value-of select="ModelID"/>
                            </td>

                            <td>
                                <xsl:value-of select="Brand"/>
                            </td>

                            <td>
                                <xsl:value-of select="Price"/>
                            </td>

                            <td>
                                <xsl:value-of select="Color"/>
                            </td>

                            <td>
                                <xsl:value-of select="SIMSize"/>
                            </td>

                            <td>
                                <xsl:value-of select="Memory"/>
                            </td>

                            <td>
                                <xsl:value-of select="Camera"/>
                            </td>

                            <td>
                                <xsl:value-of select="TouchScreen"/>
                            </td>

                            <!-- More than 10 sold = RED -->

                            <xsl:choose>

                                <xsl:when test="NoSold &gt; 10">

                                    <td class="high">
                                        <xsl:value-of select="NoSold"/>
                                    </td>

                                </xsl:when>

                                <xsl:otherwise>

                                    <td>
                                        <xsl:value-of select="NoSold"/>
                                    </td>

                                </xsl:otherwise>

                            </xsl:choose>

                            <td>
                                <xsl:value-of select="storeName"/>
                            </td>

                        </tr>

                    </xsl:for-each>

                </table>

            </body>

        </html>

    </xsl:template>

</xsl:stylesheet>