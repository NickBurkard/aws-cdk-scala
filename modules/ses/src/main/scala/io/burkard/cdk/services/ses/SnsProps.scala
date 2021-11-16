package io.burkard.cdk.services.ses

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object SnsProps {

  def apply(
    topic: software.amazon.awscdk.services.sns.ITopic,
    encoding: Option[software.amazon.awscdk.services.ses.actions.EmailEncoding] = None
  ): software.amazon.awscdk.services.ses.actions.SnsProps =
    (new software.amazon.awscdk.services.ses.actions.SnsProps.Builder)
      .topic(topic)
      .encoding(encoding.orNull)
      .build()
}
