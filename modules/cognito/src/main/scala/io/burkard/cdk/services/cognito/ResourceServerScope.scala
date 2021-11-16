package io.burkard.cdk.services.cognito

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ResourceServerScope {

  def apply(
    scopeDescription: String,
    scopeName: String
  ): software.amazon.awscdk.services.cognito.ResourceServerScope =
    software.amazon.awscdk.services.cognito.ResourceServerScope.Builder
      .create()
      .scopeDescription(scopeDescription)
      .scopeName(scopeName)
      .build()
}
