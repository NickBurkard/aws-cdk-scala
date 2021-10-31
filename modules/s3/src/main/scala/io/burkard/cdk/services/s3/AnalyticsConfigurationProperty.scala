package io.burkard.cdk.services.s3

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object AnalyticsConfigurationProperty {

  def apply(
    tagFilters: Option[List[_]] = None,
    storageClassAnalysis: Option[software.amazon.awscdk.services.s3.CfnBucket.StorageClassAnalysisProperty] = None,
    prefix: Option[String] = None,
    id: Option[String] = None
  ): software.amazon.awscdk.services.s3.CfnBucket.AnalyticsConfigurationProperty =
    (new software.amazon.awscdk.services.s3.CfnBucket.AnalyticsConfigurationProperty.Builder)
      .tagFilters(tagFilters.map(_.asJava).orNull)
      .storageClassAnalysis(storageClassAnalysis.orNull)
      .prefix(prefix.orNull)
      .id(id.orNull)
      .build()
}
