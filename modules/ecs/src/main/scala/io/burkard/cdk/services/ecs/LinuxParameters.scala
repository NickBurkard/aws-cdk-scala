package io.burkard.cdk.services.ecs

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object LinuxParameters {

  def apply(
    internalResourceId: String,
    initProcessEnabled: Option[Boolean] = None,
    sharedMemorySize: Option[Number] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.ecs.LinuxParameters =
    software.amazon.awscdk.services.ecs.LinuxParameters.Builder
      .create(stackCtx, internalResourceId)
      .initProcessEnabled(initProcessEnabled.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .sharedMemorySize(sharedMemorySize.orNull)
      .build()
}
