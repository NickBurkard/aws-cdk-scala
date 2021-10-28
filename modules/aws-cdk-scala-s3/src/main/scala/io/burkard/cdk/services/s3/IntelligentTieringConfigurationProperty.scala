package io.burkard.cdk.services.s3

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object IntelligentTieringConfigurationProperty {

  def apply(
    tagFilters: Option[List[_]] = None,
    prefix: Option[String] = None,
    tierings: Option[List[_]] = None,
    id: Option[String] = None,
    status: Option[String] = None
  ): software.amazon.awscdk.services.s3.CfnBucket.IntelligentTieringConfigurationProperty =
    (new software.amazon.awscdk.services.s3.CfnBucket.IntelligentTieringConfigurationProperty.Builder)
      .tagFilters(tagFilters.map(_.asJava).orNull)
      .prefix(prefix.orNull)
      .tierings(tierings.map(_.asJava).orNull)
      .id(id.orNull)
      .status(status.orNull)
      .build()
}
