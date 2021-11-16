package io.burkard.cdk.core

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ResolveOptions {

  def apply(
    scope: software.constructs.IConstruct,
    resolver: software.amazon.awscdk.ITokenResolver,
    preparing: Option[Boolean] = None,
    removeEmpty: Option[Boolean] = None
  ): software.amazon.awscdk.ResolveOptions =
    (new software.amazon.awscdk.ResolveOptions.Builder)
      .scope(scope)
      .resolver(resolver)
      .preparing(preparing.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .removeEmpty(removeEmpty.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}
