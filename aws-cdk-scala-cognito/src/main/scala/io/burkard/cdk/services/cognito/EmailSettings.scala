package io.burkard.cdk.services.cognito

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object EmailSettings {

  def apply(
    replyTo: Option[String] = None,
    from: Option[String] = None
  ): software.amazon.awscdk.services.cognito.EmailSettings =
    (new software.amazon.awscdk.services.cognito.EmailSettings.Builder)
      .replyTo(replyTo.orNull)
      .from(from.orNull)
      .build()
}
