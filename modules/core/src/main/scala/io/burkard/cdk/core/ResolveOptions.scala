package io.burkard.cdk.core

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ResolveOptions {

  def apply(
    scope: Option[software.constructs.IConstruct] = None,
    preparing: Option[Boolean] = None,
    resolver: Option[software.amazon.awscdk.ITokenResolver] = None,
    removeEmpty: Option[Boolean] = None
  ): software.amazon.awscdk.ResolveOptions =
    (new software.amazon.awscdk.ResolveOptions.Builder)
      .scope(scope.orNull)
      .preparing(preparing.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .resolver(resolver.orNull)
      .removeEmpty(removeEmpty.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}
