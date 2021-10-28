package io.burkard.cdk.services.docdb

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object RotationMultiUserOptions {

  def apply(
    secret: Option[software.amazon.awscdk.services.secretsmanager.ISecret] = None,
    automaticallyAfter: Option[software.amazon.awscdk.Duration] = None
  ): software.amazon.awscdk.services.docdb.RotationMultiUserOptions =
    (new software.amazon.awscdk.services.docdb.RotationMultiUserOptions.Builder)
      .secret(secret.orNull)
      .automaticallyAfter(automaticallyAfter.orNull)
      .build()
}
