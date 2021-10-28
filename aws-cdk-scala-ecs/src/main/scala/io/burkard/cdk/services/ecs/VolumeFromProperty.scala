package io.burkard.cdk.services.ecs

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object VolumeFromProperty {

  def apply(
    readOnly: Option[Boolean] = None,
    sourceContainer: Option[String] = None
  ): software.amazon.awscdk.services.ecs.CfnTaskDefinition.VolumeFromProperty =
    (new software.amazon.awscdk.services.ecs.CfnTaskDefinition.VolumeFromProperty.Builder)
      .readOnly(readOnly.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .sourceContainer(sourceContainer.orNull)
      .build()
}
