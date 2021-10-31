package io.burkard.cdk.services.rds

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object RotationSingleUserOptions {

  def apply(
    excludeCharacters: Option[String] = None,
    automaticallyAfter: Option[software.amazon.awscdk.Duration] = None
  ): software.amazon.awscdk.services.rds.RotationSingleUserOptions =
    (new software.amazon.awscdk.services.rds.RotationSingleUserOptions.Builder)
      .excludeCharacters(excludeCharacters.orNull)
      .automaticallyAfter(automaticallyAfter.orNull)
      .build()
}
