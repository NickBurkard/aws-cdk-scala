package io.burkard.cdk.services.cloudwatch

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object LogQueryWidget {

  def apply(
    logGroupNames: Option[List[String]] = None,
    height: Option[Number] = None,
    queryString: Option[String] = None,
    queryLines: Option[List[String]] = None,
    region: Option[String] = None,
    title: Option[String] = None,
    width: Option[Number] = None,
    view: Option[software.amazon.awscdk.services.cloudwatch.LogQueryVisualizationType] = None
  ): software.amazon.awscdk.services.cloudwatch.LogQueryWidget =
    software.amazon.awscdk.services.cloudwatch.LogQueryWidget.Builder
      .create()
      .logGroupNames(logGroupNames.map(_.asJava).orNull)
      .height(height.orNull)
      .queryString(queryString.orNull)
      .queryLines(queryLines.map(_.asJava).orNull)
      .region(region.orNull)
      .title(title.orNull)
      .width(width.orNull)
      .view(view.orNull)
      .build()
}
