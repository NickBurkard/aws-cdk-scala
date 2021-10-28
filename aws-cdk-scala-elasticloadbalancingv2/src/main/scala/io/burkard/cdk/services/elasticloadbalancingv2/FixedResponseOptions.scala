package io.burkard.cdk.services.elasticloadbalancingv2

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object FixedResponseOptions {

  def apply(
    messageBody: Option[String] = None,
    contentType: Option[String] = None
  ): software.amazon.awscdk.services.elasticloadbalancingv2.FixedResponseOptions =
    (new software.amazon.awscdk.services.elasticloadbalancingv2.FixedResponseOptions.Builder)
      .messageBody(messageBody.orNull)
      .contentType(contentType.orNull)
      .build()
}
