package io.burkard.cdk.services.cognito

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ResourceServerScopeProps {

  def apply(
    scopeDescription: String,
    scopeName: String
  ): software.amazon.awscdk.services.cognito.ResourceServerScopeProps =
    (new software.amazon.awscdk.services.cognito.ResourceServerScopeProps.Builder)
      .scopeDescription(scopeDescription)
      .scopeName(scopeName)
      .build()
}
