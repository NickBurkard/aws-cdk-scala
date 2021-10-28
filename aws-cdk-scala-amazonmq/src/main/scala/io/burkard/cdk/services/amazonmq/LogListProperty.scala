package io.burkard.cdk.services.amazonmq

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object LogListProperty {

  def apply(
    general: Option[Boolean] = None,
    audit: Option[Boolean] = None
  ): software.amazon.awscdk.services.amazonmq.CfnBroker.LogListProperty =
    (new software.amazon.awscdk.services.amazonmq.CfnBroker.LogListProperty.Builder)
      .general(general.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .audit(audit.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}
