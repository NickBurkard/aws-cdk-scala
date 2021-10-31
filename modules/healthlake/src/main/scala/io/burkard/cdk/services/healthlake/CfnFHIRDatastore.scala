package io.burkard.cdk.services.healthlake

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnFHIRDatastore {

  def apply(
    internalResourceId: String,
    sseConfiguration: Option[software.amazon.awscdk.services.healthlake.CfnFHIRDatastore.SseConfigurationProperty] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    datastoreName: Option[String] = None,
    datastoreTypeVersion: Option[String] = None,
    preloadDataConfig: Option[software.amazon.awscdk.services.healthlake.CfnFHIRDatastore.PreloadDataConfigProperty] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.healthlake.CfnFHIRDatastore =
    software.amazon.awscdk.services.healthlake.CfnFHIRDatastore.Builder
      .create(stackCtx, internalResourceId)
      .sseConfiguration(sseConfiguration.orNull)
      .tags(tags.map(_.asJava).orNull)
      .datastoreName(datastoreName.orNull)
      .datastoreTypeVersion(datastoreTypeVersion.orNull)
      .preloadDataConfig(preloadDataConfig.orNull)
      .build()
}
