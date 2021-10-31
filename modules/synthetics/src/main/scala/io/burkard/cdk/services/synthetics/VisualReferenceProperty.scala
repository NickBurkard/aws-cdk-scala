package io.burkard.cdk.services.synthetics

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object VisualReferenceProperty {

  def apply(
    baseScreenshots: Option[List[_]] = None,
    baseCanaryRunId: Option[String] = None
  ): software.amazon.awscdk.services.synthetics.CfnCanary.VisualReferenceProperty =
    (new software.amazon.awscdk.services.synthetics.CfnCanary.VisualReferenceProperty.Builder)
      .baseScreenshots(baseScreenshots.map(_.asJava).orNull)
      .baseCanaryRunId(baseCanaryRunId.orNull)
      .build()
}
