package io.burkard.cdk.services.ecs

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object EcsOptimizedImageOptions {

  def apply(
    cachedInContext: Option[Boolean] = None
  ): software.amazon.awscdk.services.ecs.EcsOptimizedImageOptions =
    (new software.amazon.awscdk.services.ecs.EcsOptimizedImageOptions.Builder)
      .cachedInContext(cachedInContext.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}
