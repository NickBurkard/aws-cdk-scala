package io.burkard.cdk.services.iam

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object UnknownPrincipal {

  def apply(
    resource: software.constructs.IConstruct
  ): software.amazon.awscdk.services.iam.UnknownPrincipal =
    software.amazon.awscdk.services.iam.UnknownPrincipal.Builder
      .create()
      .resource(resource)
      .build()
}
