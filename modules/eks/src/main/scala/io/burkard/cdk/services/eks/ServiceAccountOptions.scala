package io.burkard.cdk.services.eks

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ServiceAccountOptions {

  def apply(
    name: Option[String] = None,
    namespace: Option[String] = None
  ): software.amazon.awscdk.services.eks.ServiceAccountOptions =
    (new software.amazon.awscdk.services.eks.ServiceAccountOptions.Builder)
      .name(name.orNull)
      .namespace(namespace.orNull)
      .build()
}
