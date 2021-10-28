package io.burkard.cdk.services.quicksight

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object DataSourceCredentialsProperty {

  def apply(
    copySourceArn: Option[String] = None,
    credentialPair: Option[software.amazon.awscdk.services.quicksight.CfnDataSource.CredentialPairProperty] = None
  ): software.amazon.awscdk.services.quicksight.CfnDataSource.DataSourceCredentialsProperty =
    (new software.amazon.awscdk.services.quicksight.CfnDataSource.DataSourceCredentialsProperty.Builder)
      .copySourceArn(copySourceArn.orNull)
      .credentialPair(credentialPair.orNull)
      .build()
}
