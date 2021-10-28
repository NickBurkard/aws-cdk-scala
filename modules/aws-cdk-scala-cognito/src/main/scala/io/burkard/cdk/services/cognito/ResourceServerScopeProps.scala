package io.burkard.cdk.services.cognito

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object ResourceServerScopeProps {

  def apply(
    scopeDescription: Option[String] = None,
    scopeName: Option[String] = None
  ): software.amazon.awscdk.services.cognito.ResourceServerScopeProps =
    (new software.amazon.awscdk.services.cognito.ResourceServerScopeProps.Builder)
      .scopeDescription(scopeDescription.orNull)
      .scopeName(scopeName.orNull)
      .build()
}
