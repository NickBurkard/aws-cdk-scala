package io.burkard.cdk.services.glue

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object JdbcTargetProperty {

  def apply(
    connectionName: Option[String] = None,
    path: Option[String] = None,
    exclusions: Option[List[String]] = None
  ): software.amazon.awscdk.services.glue.CfnCrawler.JdbcTargetProperty =
    (new software.amazon.awscdk.services.glue.CfnCrawler.JdbcTargetProperty.Builder)
      .connectionName(connectionName.orNull)
      .path(path.orNull)
      .exclusions(exclusions.map(_.asJava).orNull)
      .build()
}
