package io.burkard.cdk.services.ecs

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object EcsOptimizedAmiProps {

  def apply(
    windowsVersion: Option[software.amazon.awscdk.services.ecs.WindowsOptimizedVersion] = None,
    cachedInContext: Option[Boolean] = None,
    generation: Option[software.amazon.awscdk.services.ec2.AmazonLinuxGeneration] = None,
    hardwareType: Option[software.amazon.awscdk.services.ecs.AmiHardwareType] = None
  ): software.amazon.awscdk.services.ecs.EcsOptimizedAmiProps =
    (new software.amazon.awscdk.services.ecs.EcsOptimizedAmiProps.Builder)
      .windowsVersion(windowsVersion.orNull)
      .cachedInContext(cachedInContext.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .generation(generation.orNull)
      .hardwareType(hardwareType.orNull)
      .build()
}
