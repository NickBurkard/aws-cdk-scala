package io.burkard.cdk.services.iam

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object UnknownPrincipalProps {

  def apply(
    resource: Option[software.constructs.IConstruct] = None
  ): software.amazon.awscdk.services.iam.UnknownPrincipalProps =
    (new software.amazon.awscdk.services.iam.UnknownPrincipalProps.Builder)
      .resource(resource.orNull)
      .build()
}
