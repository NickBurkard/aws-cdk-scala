package io.burkard.cdk.services.iam

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object UnknownPrincipal {

  def apply(
    resource: Option[software.constructs.IConstruct] = None
  ): software.amazon.awscdk.services.iam.UnknownPrincipal =
    software.amazon.awscdk.services.iam.UnknownPrincipal.Builder
      .create()
      .resource(resource.orNull)
      .build()
}
