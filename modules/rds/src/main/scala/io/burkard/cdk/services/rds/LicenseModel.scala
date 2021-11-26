package io.burkard.cdk.services.rds

sealed abstract class LicenseModel(val underlying: software.amazon.awscdk.services.rds.LicenseModel)
  extends Product
    with Serializable

object LicenseModel {
  implicit def toAws(value: LicenseModel): software.amazon.awscdk.services.rds.LicenseModel =
    Option(value).map(_.underlying).orNull

  case object BringYourOwnLicense
    extends LicenseModel(software.amazon.awscdk.services.rds.LicenseModel.BRING_YOUR_OWN_LICENSE)

  case object GeneralPublicLicense
    extends LicenseModel(software.amazon.awscdk.services.rds.LicenseModel.GENERAL_PUBLIC_LICENSE)

  case object LicenseIncluded
    extends LicenseModel(software.amazon.awscdk.services.rds.LicenseModel.LICENSE_INCLUDED)
}
