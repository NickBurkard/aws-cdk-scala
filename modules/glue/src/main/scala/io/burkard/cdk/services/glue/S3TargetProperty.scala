package io.burkard.cdk.services.glue

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object S3TargetProperty {

  def apply(
    connectionName: Option[String] = None,
    path: Option[String] = None,
    exclusions: Option[List[String]] = None
  ): software.amazon.awscdk.services.glue.CfnCrawler.S3TargetProperty =
    (new software.amazon.awscdk.services.glue.CfnCrawler.S3TargetProperty.Builder)
      .connectionName(connectionName.orNull)
      .path(path.orNull)
      .exclusions(exclusions.map(_.asJava).orNull)
      .build()
}
