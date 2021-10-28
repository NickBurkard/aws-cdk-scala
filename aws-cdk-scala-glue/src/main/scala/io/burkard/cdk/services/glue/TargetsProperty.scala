package io.burkard.cdk.services.glue

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object TargetsProperty {

  def apply(
    catalogTargets: Option[List[_]] = None,
    s3Targets: Option[List[_]] = None,
    dynamoDbTargets: Option[List[_]] = None,
    jdbcTargets: Option[List[_]] = None
  ): software.amazon.awscdk.services.glue.CfnCrawler.TargetsProperty =
    (new software.amazon.awscdk.services.glue.CfnCrawler.TargetsProperty.Builder)
      .catalogTargets(catalogTargets.map(_.asJava).orNull)
      .s3Targets(s3Targets.map(_.asJava).orNull)
      .dynamoDbTargets(dynamoDbTargets.map(_.asJava).orNull)
      .jdbcTargets(jdbcTargets.map(_.asJava).orNull)
      .build()
}
