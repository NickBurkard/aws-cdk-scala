package io.burkard.cdk.services.opsworks

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object RdsDbInstanceProperty {

  def apply(
    dbUser: String,
    rdsDbInstanceArn: String,
    dbPassword: String
  ): software.amazon.awscdk.services.opsworks.CfnStack.RdsDbInstanceProperty =
    (new software.amazon.awscdk.services.opsworks.CfnStack.RdsDbInstanceProperty.Builder)
      .dbUser(dbUser)
      .rdsDbInstanceArn(rdsDbInstanceArn)
      .dbPassword(dbPassword)
      .build()
}
