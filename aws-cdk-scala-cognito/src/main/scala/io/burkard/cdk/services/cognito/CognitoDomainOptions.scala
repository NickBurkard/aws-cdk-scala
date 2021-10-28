package io.burkard.cdk.services.cognito

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CognitoDomainOptions {

  def apply(
    domainPrefix: Option[String] = None
  ): software.amazon.awscdk.services.cognito.CognitoDomainOptions =
    (new software.amazon.awscdk.services.cognito.CognitoDomainOptions.Builder)
      .domainPrefix(domainPrefix.orNull)
      .build()
}
