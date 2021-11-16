package io.burkard.cdk.services.ses

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object Sns {

  def apply(
    topic: software.amazon.awscdk.services.sns.ITopic,
    encoding: Option[software.amazon.awscdk.services.ses.actions.EmailEncoding] = None
  ): software.amazon.awscdk.services.ses.actions.Sns =
    software.amazon.awscdk.services.ses.actions.Sns.Builder
      .create()
      .topic(topic)
      .encoding(encoding.orNull)
      .build()
}
