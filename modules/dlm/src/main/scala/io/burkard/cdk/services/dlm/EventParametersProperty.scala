package io.burkard.cdk.services.dlm

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object EventParametersProperty {

  def apply(
    descriptionRegex: Option[String] = None,
    eventType: Option[String] = None,
    snapshotOwner: Option[List[String]] = None
  ): software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.EventParametersProperty =
    (new software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.EventParametersProperty.Builder)
      .descriptionRegex(descriptionRegex.orNull)
      .eventType(eventType.orNull)
      .snapshotOwner(snapshotOwner.map(_.asJava).orNull)
      .build()
}
