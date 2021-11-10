package io.burkard.cdk.services.datasync

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object QopConfigurationProperty {

  def apply(
    dataTransferProtection: Option[String] = None,
    rpcProtection: Option[String] = None
  ): software.amazon.awscdk.services.datasync.CfnLocationHDFS.QopConfigurationProperty =
    (new software.amazon.awscdk.services.datasync.CfnLocationHDFS.QopConfigurationProperty.Builder)
      .dataTransferProtection(dataTransferProtection.orNull)
      .rpcProtection(rpcProtection.orNull)
      .build()
}
