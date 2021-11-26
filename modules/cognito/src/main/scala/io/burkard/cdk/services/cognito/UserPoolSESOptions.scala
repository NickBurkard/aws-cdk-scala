package io.burkard.cdk.services.cognito

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object UserPoolSESOptions {

  def apply(
    fromEmail: String,
    fromName: Option[String] = None,
    replyTo: Option[String] = None,
    sesRegion: Option[String] = None,
    configurationSetName: Option[String] = None
  ): software.amazon.awscdk.services.cognito.UserPoolSESOptions =
    (new software.amazon.awscdk.services.cognito.UserPoolSESOptions.Builder)
      .fromEmail(fromEmail)
      .fromName(fromName.orNull)
      .replyTo(replyTo.orNull)
      .sesRegion(sesRegion.orNull)
      .configurationSetName(configurationSetName.orNull)
      .build()
}
