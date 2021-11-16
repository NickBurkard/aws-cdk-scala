package io.burkard.cdk.services.lookoutmetrics

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object RDSSourceConfigProperty {

  def apply(
    databasePort: Number,
    vpcConfiguration: software.amazon.awscdk.services.lookoutmetrics.CfnAnomalyDetector.VpcConfigurationProperty,
    tableName: String,
    roleArn: String,
    dbInstanceIdentifier: String,
    secretManagerArn: String,
    databaseName: String,
    databaseHost: String
  ): software.amazon.awscdk.services.lookoutmetrics.CfnAnomalyDetector.RDSSourceConfigProperty =
    (new software.amazon.awscdk.services.lookoutmetrics.CfnAnomalyDetector.RDSSourceConfigProperty.Builder)
      .databasePort(databasePort)
      .vpcConfiguration(vpcConfiguration)
      .tableName(tableName)
      .roleArn(roleArn)
      .dbInstanceIdentifier(dbInstanceIdentifier)
      .secretManagerArn(secretManagerArn)
      .databaseName(databaseName)
      .databaseHost(databaseHost)
      .build()
}
