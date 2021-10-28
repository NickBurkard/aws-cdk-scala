package io.burkard.cdk.services.cognito

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object AccountRecoverySettingProperty {

  def apply(
    recoveryMechanisms: Option[List[_]] = None
  ): software.amazon.awscdk.services.cognito.CfnUserPool.AccountRecoverySettingProperty =
    (new software.amazon.awscdk.services.cognito.CfnUserPool.AccountRecoverySettingProperty.Builder)
      .recoveryMechanisms(recoveryMechanisms.map(_.asJava).orNull)
      .build()
}
