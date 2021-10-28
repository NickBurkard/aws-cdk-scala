package io.burkard.cdk.services.ecs

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object Host {

  def apply(
    sourcePath: Option[String] = None
  ): software.amazon.awscdk.services.ecs.Host =
    (new software.amazon.awscdk.services.ecs.Host.Builder)
      .sourcePath(sourcePath.orNull)
      .build()
}
