package io.burkard.cdk.services.databrew

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object RecipeProperty {

  def apply(
    name: Option[String] = None,
    version: Option[String] = None
  ): software.amazon.awscdk.services.databrew.CfnJob.RecipeProperty =
    (new software.amazon.awscdk.services.databrew.CfnJob.RecipeProperty.Builder)
      .name(name.orNull)
      .version(version.orNull)
      .build()
}
