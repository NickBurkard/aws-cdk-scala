package io.burkard.cdk.services.dlm

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object EventParametersProperty {

  def apply(
    eventType: String,
    snapshotOwner: List[String],
    descriptionRegex: Option[String] = None
  ): software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.EventParametersProperty =
    (new software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.EventParametersProperty.Builder)
      .eventType(eventType)
      .snapshotOwner(snapshotOwner.asJava)
      .descriptionRegex(descriptionRegex.orNull)
      .build()
}
