package io.burkard.cdk.services.s3

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object MetricsConfigurationProperty {

  def apply(
    id: String,
    tagFilters: Option[List[_]] = None,
    prefix: Option[String] = None,
    accessPointArn: Option[String] = None
  ): software.amazon.awscdk.services.s3.CfnBucket.MetricsConfigurationProperty =
    (new software.amazon.awscdk.services.s3.CfnBucket.MetricsConfigurationProperty.Builder)
      .id(id)
      .tagFilters(tagFilters.map(_.asJava).orNull)
      .prefix(prefix.orNull)
      .accessPointArn(accessPointArn.orNull)
      .build()
}
