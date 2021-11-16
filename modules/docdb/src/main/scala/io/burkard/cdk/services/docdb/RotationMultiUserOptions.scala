package io.burkard.cdk.services.docdb

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object RotationMultiUserOptions {

  def apply(
    secret: software.amazon.awscdk.services.secretsmanager.ISecret,
    automaticallyAfter: Option[software.amazon.awscdk.Duration] = None
  ): software.amazon.awscdk.services.docdb.RotationMultiUserOptions =
    (new software.amazon.awscdk.services.docdb.RotationMultiUserOptions.Builder)
      .secret(secret)
      .automaticallyAfter(automaticallyAfter.orNull)
      .build()
}
