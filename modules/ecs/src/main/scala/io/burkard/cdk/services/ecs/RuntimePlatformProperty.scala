package io.burkard.cdk.services.ecs

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object RuntimePlatformProperty {

  def apply(
    operatingSystemFamily: Option[String] = None,
    cpuArchitecture: Option[String] = None
  ): software.amazon.awscdk.services.ecs.CfnTaskDefinition.RuntimePlatformProperty =
    (new software.amazon.awscdk.services.ecs.CfnTaskDefinition.RuntimePlatformProperty.Builder)
      .operatingSystemFamily(operatingSystemFamily.orNull)
      .cpuArchitecture(cpuArchitecture.orNull)
      .build()
}
