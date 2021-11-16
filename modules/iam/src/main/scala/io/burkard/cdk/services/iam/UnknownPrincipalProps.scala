package io.burkard.cdk.services.iam

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object UnknownPrincipalProps {

  def apply(
    resource: software.constructs.IConstruct
  ): software.amazon.awscdk.services.iam.UnknownPrincipalProps =
    (new software.amazon.awscdk.services.iam.UnknownPrincipalProps.Builder)
      .resource(resource)
      .build()
}
