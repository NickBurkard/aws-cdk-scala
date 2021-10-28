package io.burkard.cdk.services.dlm

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
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
