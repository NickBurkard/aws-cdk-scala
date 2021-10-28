package io.burkard.cdk.services.s3

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object MetricsConfigurationProperty {

  def apply(
    tagFilters: Option[List[_]] = None,
    prefix: Option[String] = None,
    accessPointArn: Option[String] = None,
    id: Option[String] = None
  ): software.amazon.awscdk.services.s3.CfnBucket.MetricsConfigurationProperty =
    (new software.amazon.awscdk.services.s3.CfnBucket.MetricsConfigurationProperty.Builder)
      .tagFilters(tagFilters.map(_.asJava).orNull)
      .prefix(prefix.orNull)
      .accessPointArn(accessPointArn.orNull)
      .id(id.orNull)
      .build()
}
