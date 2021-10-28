package io.burkard.cdk.services.cognito

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object ResourceServerScope {

  def apply(
    scopeDescription: Option[String] = None,
    scopeName: Option[String] = None
  ): software.amazon.awscdk.services.cognito.ResourceServerScope =
    software.amazon.awscdk.services.cognito.ResourceServerScope.Builder
      .create()
      .scopeDescription(scopeDescription.orNull)
      .scopeName(scopeName.orNull)
      .build()
}
