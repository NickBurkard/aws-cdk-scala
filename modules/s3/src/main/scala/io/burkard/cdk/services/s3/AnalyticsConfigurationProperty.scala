package io.burkard.cdk.services.s3

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object AnalyticsConfigurationProperty {

  def apply(
    storageClassAnalysis: software.amazon.awscdk.services.s3.CfnBucket.StorageClassAnalysisProperty,
    id: String,
    tagFilters: Option[List[_]] = None,
    prefix: Option[String] = None
  ): software.amazon.awscdk.services.s3.CfnBucket.AnalyticsConfigurationProperty =
    (new software.amazon.awscdk.services.s3.CfnBucket.AnalyticsConfigurationProperty.Builder)
      .storageClassAnalysis(storageClassAnalysis)
      .id(id)
      .tagFilters(tagFilters.map(_.asJava).orNull)
      .prefix(prefix.orNull)
      .build()
}
