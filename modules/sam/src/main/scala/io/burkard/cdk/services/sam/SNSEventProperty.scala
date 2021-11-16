package io.burkard.cdk.services.sam

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object SNSEventProperty {

  def apply(
    topic: String
  ): software.amazon.awscdk.services.sam.CfnFunction.SNSEventProperty =
    (new software.amazon.awscdk.services.sam.CfnFunction.SNSEventProperty.Builder)
      .topic(topic)
      .build()
}
