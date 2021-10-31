package io.burkard.cdk.services.config

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object RecordingGroupProperty {

  def apply(
    resourceTypes: Option[List[String]] = None,
    includeGlobalResourceTypes: Option[Boolean] = None,
    allSupported: Option[Boolean] = None
  ): software.amazon.awscdk.services.config.CfnConfigurationRecorder.RecordingGroupProperty =
    (new software.amazon.awscdk.services.config.CfnConfigurationRecorder.RecordingGroupProperty.Builder)
      .resourceTypes(resourceTypes.map(_.asJava).orNull)
      .includeGlobalResourceTypes(includeGlobalResourceTypes.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .allSupported(allSupported.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}
