package io.burkard.cdk.services.ecs

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ContainerDependency {

  def apply(
    container: Option[software.amazon.awscdk.services.ecs.ContainerDefinition] = None,
    condition: Option[software.amazon.awscdk.services.ecs.ContainerDependencyCondition] = None
  ): software.amazon.awscdk.services.ecs.ContainerDependency =
    (new software.amazon.awscdk.services.ecs.ContainerDependency.Builder)
      .container(container.orNull)
      .condition(condition.orNull)
      .build()
}
