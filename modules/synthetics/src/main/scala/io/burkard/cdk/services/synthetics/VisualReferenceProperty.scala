package io.burkard.cdk.services.synthetics

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object VisualReferenceProperty {

  def apply(
    baseCanaryRunId: String,
    baseScreenshots: Option[List[_]] = None
  ): software.amazon.awscdk.services.synthetics.CfnCanary.VisualReferenceProperty =
    (new software.amazon.awscdk.services.synthetics.CfnCanary.VisualReferenceProperty.Builder)
      .baseCanaryRunId(baseCanaryRunId)
      .baseScreenshots(baseScreenshots.map(_.asJava).orNull)
      .build()
}
